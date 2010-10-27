/**
 * Copyright (C) 2010 Osman Shoukry
 *
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.openpojo.registry;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.openpojo.business.BusinessIdentity;

/**
 * @author oshoukry
 */
public class ServiceRegistrar {
    private static final Map<String, Service> SERVICES = new ConcurrentHashMap<String, Service>();

    public static void registerService(final String name, final Service service) {
        SERVICES.put(name, service);
    }

    public static void unregisterService(final String name) {
        SERVICES.remove(name);
    }

    public static Service getServiceByName(final String name) {
        return SERVICES.get(name);
    }

    @Override
    public String toString() {
        return BusinessIdentity.toString(this);
    }
}