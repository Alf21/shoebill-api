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

import net.gtaun.shoebill.constant.ClickPlayerSource;
import net.gtaun.shoebill.object.Player;
import net.gtaun.util.event.Interruptable;

/**
 * This event represents the OnPlayerClickPlayer of Pawn.
 * 
 * @author MK124
 * @see net.gtaun.shoebill.event.player.PlayerEvent
 * @see <a href="https://wiki.sa-mp.com/wiki/OnPlayerClickPlayer">OnPlayerClickPlayer</a>
 */
public class PlayerClickPlayerEvent extends PlayerEvent implements Interruptable
{
	private Player clickedPlayer;
	private ClickPlayerSource source;
	
	
	public PlayerClickPlayerEvent(Player player, Player clickedPlayer, int source)
	{
		super(player);
		this.clickedPlayer = clickedPlayer;
		this.source = ClickPlayerSource.SCOREBOARD;
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
	 * @return The clicked player of this event
	 */
	public Player getClickedPlayer()
	{
		return clickedPlayer;
	}
	
	/**
	 * @return The associated ClickPlayerSource the player clicked
	 */
	public ClickPlayerSource getSource()
	{
		return source;
	}
}
