package com.wordpress.salaboy.smarttasks.formbuilder.api;

import java.util.List;

/**
 * Represents a service that gives information about the possible actions that can be applied to a
 * task.
 * 
 * @author calcacuervo
 * 
 */
public interface TaskOperationsDefinition {

	/**
	 * Returns the name of the allowed operations for a given state.
	 * 
	 * @return the name of the allowed operations for a given state.
	 */
	public List<String> getOperations(String state);

	/**
	 * Returns the operations list.
	 * 
	 * @return the operations list.
	 */
	public List<String> getOperationsList();

}
