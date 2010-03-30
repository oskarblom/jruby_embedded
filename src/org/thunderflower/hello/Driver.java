package org.thunderflower.hello;

import org.jruby.embed.PathType;
import org.jruby.embed.ScriptingContainer;

public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws InterruptedException {
		ScriptingContainer container = new ScriptingContainer();		
		container.runScriptlet(PathType.CLASSPATH, "hello.rb");
	}
}
