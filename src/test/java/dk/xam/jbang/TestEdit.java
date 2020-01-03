package dk.xam.jbang;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.aesh.AeshRuntimeRunner;
import org.hamcrest.io.FileMatchers;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

public class TestEdit {

	@Test
	void testEdit(@TempDir Path outputDir) throws IOException {

		String s = outputDir.resolve("edit.java").toString();

		AeshRuntimeRunner.builder().interactive(true).command(Main.class).args(new String[] { "--init", s }).execute();

		assertThat(new File(s).exists(), is(true));

		Script script = new Script(new File(s));

		Main main = new Main();
		File project = main.createProject(script, "", script.collectDependencies());

		assertThat(new File(project, "src"), FileMatchers.anExistingDirectory());
		var build = new File(project, "build.gradle");
		assert (build.exists());
		assertThat(Files.readString(build.toPath()), containsString("dependencies"));
		var src = new File(project, "src/edit.java");
		assert (src.exists());
		assert (Files.isSymbolicLink(src.toPath()));

	}
}
