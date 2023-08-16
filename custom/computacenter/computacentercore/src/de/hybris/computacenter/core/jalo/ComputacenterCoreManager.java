/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.computacenter.core.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import de.hybris.computacenter.core.constants.ComputacenterCoreConstants;
import de.hybris.computacenter.core.setup.CoreSystemSetup;


/**
 * Do not use, please use {@link CoreSystemSetup} instead.
 * 
 */
public class ComputacenterCoreManager extends GeneratedComputacenterCoreManager
{
	public static final ComputacenterCoreManager getInstance()
	{
		final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (ComputacenterCoreManager) em.getExtension(ComputacenterCoreConstants.EXTENSIONNAME);
	}
}
