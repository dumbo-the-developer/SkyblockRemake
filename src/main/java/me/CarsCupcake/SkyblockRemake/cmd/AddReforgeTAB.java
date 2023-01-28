package me.CarsCupcake.SkyblockRemake.cmd;

import java.util.ArrayList;

import java.util.List;

import org.bukkit.command.Command;

import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

import me.CarsCupcake.SkyblockRemake.Items.reforges.registerReforge;


public class AddReforgeTAB implements  TabCompleter{
	
List<String> arguments = new ArrayList<String>();
	
	public List<String> onTabComplete(CommandSender sender, Command cmd, String label, String[] args) {
		
		List<String> result = new ArrayList<String>();
		if(arguments.isEmpty()) {
		for (String key : registerReforge.reforges.keySet()) {
			arguments.add(key);
			
		}
		arguments.add("remove");
		}
		
		if(args.length == 1) {
			for (String a : arguments) {
				if (a.toLowerCase().startsWith(args[0].toLowerCase()))
					result.add(a);
			}
			return result;
		}
		
		if (args.length >= 2) {
			for (String a : arguments) {
				a = "";
				result.add(a);
			}
			return result;
		}
			
		
		
		return null;
	}

}
