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
public class Demo {

	public static void main(String[] args) {
		Light light = new Light();
		Television tv = new Television();

		HomeTVFecade fecade = new HomeTVFecade(light, tv);
		fecade.watchTV();
		tv.setVolume(40);
		tv.channelSwitch(8);
		
		fecade.endTV();
	}
}
