package com.newrelic.api.Message;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

public class MessageApplication extends Application
{
   private Set<Object> singletons = new HashSet<Object>();
   private Set<Class<?>> empty = new HashSet<Class<?>>();

   public MessageApplication()
   {
      singletons.add(new MessageResource());
   }

   @Override
   public Set<Class<?>> getClasses()
   {
      return empty;
   }

   @Override
   public Set<Object> getSingletons()
   {
      return singletons;
   }

}
