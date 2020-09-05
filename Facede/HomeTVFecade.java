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
public class HomeTVFecade {
	private Light light;
	private Television tv;

	public HomeTVFecade(Light light, Television tv) {
		this.light = light;
		this.tv = tv;
	}
	
	public void watchTV()
	{
		System.out.println("Enjoy your movie!");
		this.light.off();
		this.tv.on();
		this.tv.channelSwitch(3);
	}
	
	public void endTV()
	{
		System.out.println("Thank you");
		this.light.on();
		this.tv.off();
	}
}
