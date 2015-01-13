package me.xerces.eventbus;

import me.xerces.eventbus.annotation.EventHandler;

import java.lang.reflect.Method;

/**
 * The event handle which holds the method and method object
 * @author Xerces
 */
public class EventHandle {

    private Method method;

    private Object methodClass;

    private EventHandler.EventPriority priority;

    public EventHandle(Method method, Object methodClass, EventHandler.EventPriority priority)
    {
        this.method = method;
        this.methodClass = methodClass;
        this.priority = priority;
    }

    public EventHandler.EventPriority getPriority() {
        return priority;
    }

    public Method getMethod() {
        return method;
    }

    public Object getMethodClass() {
        return methodClass;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof EventHandle && ((EventHandle) obj).getMethod().equals(method) && ((EventHandle) obj).getMethodClass().equals(methodClass);
    }
}
