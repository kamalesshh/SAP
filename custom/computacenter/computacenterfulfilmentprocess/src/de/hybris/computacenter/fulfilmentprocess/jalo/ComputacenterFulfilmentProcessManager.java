/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.computacenter.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import de.hybris.computacenter.fulfilmentprocess.constants.ComputacenterFulfilmentProcessConstants;

public class ComputacenterFulfilmentProcessManager extends GeneratedComputacenterFulfilmentProcessManager
{
	public static final ComputacenterFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (ComputacenterFulfilmentProcessManager) em.getExtension(ComputacenterFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
