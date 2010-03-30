package org.thunderflower.hello;

import org.jruby.embed.ScriptingContainer;

public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new ScriptingContainer().runScriptlet("puts 'Hello, jruby!'");
	}

}
