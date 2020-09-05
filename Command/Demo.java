/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;


/**
 *
 * @author hailiang194
 */
public class Demo {
	public static void main(String[] args) {

		Command.control.Door door = new Command.control.Door();
		Command.command.DoorOpenCommand doorOpenCmd = new Command.command.DoorOpenCommand(door);
		Command.command.DoorClosedCommand doorClosedCmd = new Command.command.DoorClosedCommand(door);
		
		Command.control.Light light = new Command.control.Light();
		Command.command.LightOnCommand lightOnCmd = new Command.command.LightOnCommand(light);
		Command.command.LightOffCommand lightOffCmd = new Command.command.LightOffCommand(light);
		
		Command.control.Fan fan = new Command.control.Fan();
		Command.command.FanHighCommand fanHignCmd = new Command.command.FanHighCommand(fan);
		Command.command.FanMediumCommand fanMediumCmd = new Command.command.FanMediumCommand(fan);
		Command.command.FanLowCommand fanLowCmd = new Command.command.FanLowCommand(fan);
		Command.command.FanOffCommand fanOffCmd = new Command.command.FanOffCommand(fan);
		
		System.out.println("SIMPLE REMOTE DEMO");
		Command.remote.SimpleRemote remote = new Command.remote.SimpleRemote();
		remote.setSlot(lightOnCmd);
		remote.buttonWasPressed();
		
		remote.setSlot(doorOpenCmd);
		remote.buttonWasPressed();
		
		System.out.println("REMOTE CONTROL DEMO");
		Command.remote.RemoteControl control = new Command.remote.RemoteControl();
		control.setCommand(0, lightOnCmd, lightOffCmd);
		control.setCommand(1, doorOpenCmd, doorClosedCmd);
		control.setCommand(2, fanHignCmd, fanOffCmd);
		control.setCommand(3, fanMediumCmd, fanOffCmd);
		control.setCommand(4, fanLowCmd, fanOffCmd);
		System.out.println(control);
		
		control.onButtonPushed(0);
		control.offButtonPushed(0);
		control.onButtonPushed(1);
		control.offButtonPushed(1);
		control.undoButtonPushed();
		control.onButtonPushed(2);
		control.onButtonPushed(3);
		control.undoButtonPushed();
	}
}
