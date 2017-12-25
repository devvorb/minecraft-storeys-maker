/**
 * ch.vorburger.minecraft.storeys
 *
 * Copyright (C) 2016 - 2017 Michael Vorburger.ch <mike@vorburger.ch>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package ch.vorburger.minecraft.storeys.plugin;

import org.spongepowered.api.plugin.Plugin;

@Plugin(id = "storeys", name = "Vorburger.ch's Storeys", version = "1.0",
    description = "Makes entities narrate story lines so you can make your own movie in Minecraft",
    url = "https://github.com/vorburger/minecraft-storeys-maker",
    authors = "Michael Vorburger.ch")
public class StoreysPlugin extends AbstractStoreysPlugin {
}
