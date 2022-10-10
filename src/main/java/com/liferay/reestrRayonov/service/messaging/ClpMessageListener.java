package com.liferay.reestrRayonov.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import com.liferay.reestrRayonov.service.ClpSerializer;
import com.liferay.reestrRayonov.service.RayonLocalServiceUtil;
import com.liferay.reestrRayonov.service.RayonServiceUtil;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            RayonLocalServiceUtil.clearService();

            RayonServiceUtil.clearService();
        }
    }
}
