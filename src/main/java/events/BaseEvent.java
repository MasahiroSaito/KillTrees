package events;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

/**
 * Created by masahiro on 2017/01/08.
 */
public abstract class BaseEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();

    @Override
    public HandlerList getHandlers() { return HANDLERS; }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }
}
