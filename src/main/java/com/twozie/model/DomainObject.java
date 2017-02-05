package com.twozie.model;

import java.util.Objects;


public interface DomainObject extends Cloneable
{
	
    default Boolean isLoaded()
    {
        return false;
    }

    default boolean deeplyEquals(DomainObject other)
    {
        if (!Objects.deepEquals(this, other))
            return false;
        return true;
    }


}
