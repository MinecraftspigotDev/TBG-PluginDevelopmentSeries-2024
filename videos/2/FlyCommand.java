package nl.techjunkyben.hire.thebelgiumgamestutorial.commands;


import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class FlyCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender,@NotNull Command command,@NotNull String s,@NotNull String[] strings) {

        if(!(commandSender instanceof Player)){
            commandSender.sendMessage("Alleen spelers kunnen dit commando uit voeren");
        }

        Player player = (Player) commandSender;
        if(player.getAllowFlight()){
            player.setAllowFlight(false);
            player.sendMessage("Vliegen is UitGeschakeld");
        }
        else{
            player.setAllowFlight(true);
            player.sendMessage("Vliegen is Ingeschakeld");
        }

        return true;
    }
}
