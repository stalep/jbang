package dk.xam.jbang;

class TestArguments {

	/*
	 * Why test this, this is something the terminal api should have tests for?
	 * private CommandLine cli; private Main main;
	 * 
	 * @BeforeEach void setup() { cli = Main.getCommandLine(); main =
	 * cli.getCommand(); }
	 * 
	 * @Test public void testBasicArguments() { cli.parseArgs("-h", "--debug",
	 * "myfile.java");
	 * 
	 * assert main.helpRequested; assertThat(main.debug(), is(true));
	 * assertThat(main.scriptOrFile, is("myfile.java"));
	 * assertThat(main.userParams.size(), is(0));
	 * 
	 * }
	 * 
	 * @Test public void testDoubleDebug() { cli.parseArgs("--debug", "test.java",
	 * "--debug", "wonka"); assertThat(main.debug(), is(true));
	 * assertThat(main.debugPort, is(4004));
	 * 
	 * assertThat(main.scriptOrFile, is("test.java")); assertThat(main.userParams,
	 * is(Arrays.asList("--debug", "wonka"))); }
	 * 
	 * /**
	 * 
	 * @Test public void testInit() { cli.parseArgs("--init", "x.java", "y.java");
	 * assertThat(main.script, is("x.java")); assertThat(main.params,
	 * is(Arrays.asList("x.java", "y.java"))); }
	 **/

	/*
	 * @Test public void testStdInWithHelpParam() { cli.parseArgs("-", "--help");
	 * assertThat(main.scriptOrFile, is("-")); assertThat(main.helpRequested,
	 * is(false)); assertThat(main.userParams, is(Arrays.asList("--help"))); }
	 * 
	 * @Test public void testScriptWithHelpParam() { cli.parseArgs("test.java",
	 * "-h"); assertThat(main.scriptOrFile, is("test.java"));
	 * assertThat(main.helpRequested, is(false)); assertThat(main.userParams,
	 * is(Arrays.asList("-h"))); }
	 * 
	 * @Test public void testDebugWithScript() { cli.parseArgs("--debug",
	 * "test.java"); assertThat(main.scriptOrFile, is("test.java"));
	 * assertThat(main.debug(), is(true)); }
	 * 
	 * @Test public void testDebugPort() { cli.parseArgs("--debug=5000",
	 * "test.java"); assertThat(main.scriptOrFile, is("test.java"));
	 * assertThat(main.debug(), is(true)); assertThat(main.debugPort, is(5000)); }
	 * 
	 * @Test public void testDebugPortSeperateValue() { cli.parseArgs("--debug",
	 * "5005", "test.java"); assertThat(main.scriptOrFile, is("test.java"));
	 * assertThat(main.debug(), is(true)); assertThat(main.debugPort, is(5005)); }
	 * 
	 * @Test public void testSimpleScript() { cli.parseArgs("test.java");
	 * assertThat(main.scriptOrFile, is("test.java")); }
	 */

	/*
	 * @Test public void testClearCache() { cli.parseArgs("--clear-cache");
	 * assertThat(main.clearCache, is(true)); }
	 */
}
