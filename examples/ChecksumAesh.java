
import org.aesh.AeshRuntimeRunner;
import org.aesh.command.Command;
import org.aesh.command.CommandDefinition;
import org.aesh.command.CommandResult;
import org.aesh.command.invocation.CommandInvocation;
import org.aesh.command.option.Argument;
import org.aesh.command.option.Option;

import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@CommandDefinition(name = "checksum", generateHelp = true,
        description = "Prints the checksum (MD5 by default) of a file to STDOUT.")
public class ChecksumAesh implements Command<CommandInvocation> {

    @Argument(required = true, description = "The file whose checksum to calculate.")
    private File file;

    @Option(shortName = 'a', defaultValue = "MD5", description = "MD5, SHA-1, SHA-256, ...")
    private String algorithm;

    @Override
    public CommandResult execute(CommandInvocation invocation) {
        try {
            byte[] digest = MessageDigest.getInstance(algorithm).digest(Files.readAllBytes(file.toPath()));
            invocation.println(String.format("%0" + (digest.length*2) + "x%n", new BigInteger(1, digest)));
        }
        catch (IOException | NoSuchAlgorithmException e) {
            invocation.println(e.getMessage());
        }
        return CommandResult.SUCCESS;
    }

    public static void main(String... args) {
        AeshRuntimeRunner.builder().interactive(true).command(ChecksumAesh.class).args(args).execute();
    }

}
