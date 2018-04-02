package com.horstmann.violet.product.diagram.communication;

import com.horstmann.violet.framework.plugin.AbstractDiagramPlugin;

/**
 * 
 * @author Artur Ratajczak
 *
 */
public class CommunicationDiagramPlugin extends AbstractDiagramPlugin
{
	public CommunicationDiagramPlugin()
	{
		super(CommunicationDiagramGraph.class, CommunicationDiagramConstant.COMMUNICATION_DIAGRAM_STRINGS);
	}

	@Override
	public String getProvider() {
		return "Artur Ratajczak / Adrian Bobrowski";
	}

	@Override
	public String getVersion()
	{
		return "1.0.3";
	}
}
