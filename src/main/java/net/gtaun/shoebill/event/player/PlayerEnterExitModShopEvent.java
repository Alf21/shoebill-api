/**
 * Copyright (C) 2011 MK124
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.gtaun.shoebill.event.player;

import net.gtaun.shoebill.object.Player;
import net.gtaun.util.event.Interruptable;

/**
 * This event represents the OnPlayerEnterExitModShop of Pawn.
 * 
 * @author MK124
 * @see net.gtaun.shoebill.event.player.PlayerEvent
 * @see <a href="https://wiki.sa-mp.com/wiki/OnPlayerEnterExitModShop">OnPlayerEnterExitModShop</a>
 */
public class PlayerEnterExitModShopEvent extends PlayerEvent implements Interruptable
{
	private int enterExit;
	private int interiorId;
	
	
	public PlayerEnterExitModShopEvent(Player player, int enterexit, int interiorId)
	{
		super(player);
		this.enterExit = enterexit;
		this.interiorId = interiorId;
	}
	
	/*
	 * (non-Javadoc)
	 * @see net.gtaun.util.event.Event#interrupt()
	 */
	@Override
	public void interrupt()
	{
		super.interrupt();
	}
    
    /**
     * @return The associated value for this event.
     */
	public int getEnterExit()
	{
		return enterExit;
	}
    
    /**
     * @return The associated id of interior for this event.
     */
	public int getInteriorId()
	{
		return interiorId;
	}
}
