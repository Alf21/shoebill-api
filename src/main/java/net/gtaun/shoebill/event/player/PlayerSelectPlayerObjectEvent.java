/**
 * Copyright (C) 2012 MK124
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
import net.gtaun.shoebill.object.PlayerObject;
import net.gtaun.util.event.Interruptable;

/**
 * This event represents the OnPlayerSelectPlayerObject of Pawn.
 * 
 * @author MK124
 * @see net.gtaun.shoebill.event.player.PlayerEvent
 * @see <a href="https://wiki.sa-mp.com/wiki/OnPlayerSelectPlayerObject">OnPlayerSelectPlayerObject</a>
 */
public class PlayerSelectPlayerObjectEvent extends PlayerEvent implements Interruptable
{
	private PlayerObject object;
	
	
	public PlayerSelectPlayerObjectEvent(Player player, PlayerObject object)
	{
		super(player);
		this.object = object;
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
     * @return The associated selected PlayerObject for this event.
     */
	public PlayerObject getObject()
	{
		return object;
	}
}
