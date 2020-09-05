/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facede;

/**
 *
 * @author hailiang194
 */
public class Television {
	public void on()
	{
		System.out.println("TV on");
	}
	
	public void off()
	{
		System.out.println("TV off");
	}
	
	public void channelSwitch(int channel)
	{
		System.out.println("Switch to " + channel);
	}
	
	public void setVolume(double volume)
	{
		System.out.printf("TV volume %.2f", volume);
	}
}
