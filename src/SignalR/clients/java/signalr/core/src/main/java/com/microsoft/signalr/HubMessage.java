// Licensed to the .NET Foundation under one or more agreements.
// The .NET Foundation licenses this file to you under the MIT license.

package com.microsoft.signalr;

/**
 * A base class for hub messages.
 */
public abstract class HubMessage {
    public abstract HubMessageType getMessageType();
}
