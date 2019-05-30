package fourteener.worldeditor.operations.operators;

import fourteener.worldeditor.operations.Operator;
import fourteener.worldeditor.worldeditor.macros.MacroLauncher;

public class MacroNode extends Node {
	
	String arg;
	
	public static MacroNode newNode (String macro) {
		MacroNode macroNode = new MacroNode();
		macroNode.arg = macro;
		return macroNode;
	}
	
	public boolean performNode () {
		return MacroLauncher.launchMacro(arg, Operator.currentBlock.getLocation());
	}
	
	public static int getArgCount () {
		return 1;
	}
}
