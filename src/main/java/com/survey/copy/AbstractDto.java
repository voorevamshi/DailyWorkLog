package com.survey.copy;

import java.io.Serializable;

public abstract class AbstractDto implements Serializable {

	public abstract boolean equals(Object obj);
	public abstract int hashCode();
	public abstract String toString();

}
