package com.liferay.reestrRayonov.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.liferay.reestrRayonov.service.ClpSerializer;
import com.liferay.reestrRayonov.service.RayonLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class RayonClp extends BaseModelImpl<Rayon> implements Rayon {
    private long _rayonId;
    private String _name;
    private int _kod;
    private boolean _archive;
    private BaseModel<?> _rayonRemoteModel;
    private Class<?> _clpSerializerClass = com.liferay.reestrRayonov.service.ClpSerializer.class;

    public RayonClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Rayon.class;
    }

    @Override
    public String getModelClassName() {
        return Rayon.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _rayonId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setRayonId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _rayonId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("rayonId", getRayonId());
        attributes.put("name", getName());
        attributes.put("kod", getKod());
        attributes.put("archive", getArchive());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long rayonId = (Long) attributes.get("rayonId");

        if (rayonId != null) {
            setRayonId(rayonId);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }

        Integer kod = (Integer) attributes.get("kod");

        if (kod != null) {
            setKod(kod);
        }

        Boolean archive = (Boolean) attributes.get("archive");

        if (archive != null) {
            setArchive(archive);
        }
    }

    @Override
    public long getRayonId() {
        return _rayonId;
    }

    @Override
    public void setRayonId(long rayonId) {
        _rayonId = rayonId;

        if (_rayonRemoteModel != null) {
            try {
                Class<?> clazz = _rayonRemoteModel.getClass();

                Method method = clazz.getMethod("setRayonId", long.class);

                method.invoke(_rayonRemoteModel, rayonId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getName() {
        return _name;
    }

    @Override
    public void setName(String name) {
        _name = name;

        if (_rayonRemoteModel != null) {
            try {
                Class<?> clazz = _rayonRemoteModel.getClass();

                Method method = clazz.getMethod("setName", String.class);

                method.invoke(_rayonRemoteModel, name);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getKod() {
        return _kod;
    }

    @Override
    public void setKod(int kod) {
        _kod = kod;

        if (_rayonRemoteModel != null) {
            try {
                Class<?> clazz = _rayonRemoteModel.getClass();

                Method method = clazz.getMethod("setKod", int.class);

                method.invoke(_rayonRemoteModel, kod);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public boolean getArchive() {
        return _archive;
    }

    @Override
    public boolean isArchive() {
        return _archive;
    }

    @Override
    public void setArchive(boolean archive) {
        _archive = archive;

        if (_rayonRemoteModel != null) {
            try {
                Class<?> clazz = _rayonRemoteModel.getClass();

                Method method = clazz.getMethod("setArchive", boolean.class);

                method.invoke(_rayonRemoteModel, archive);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getRayonRemoteModel() {
        return _rayonRemoteModel;
    }

    public void setRayonRemoteModel(BaseModel<?> rayonRemoteModel) {
        _rayonRemoteModel = rayonRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _rayonRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_rayonRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            RayonLocalServiceUtil.addRayon(this);
        } else {
            RayonLocalServiceUtil.updateRayon(this);
        }
    }

    @Override
    public Rayon toEscapedModel() {
        return (Rayon) ProxyUtil.newProxyInstance(Rayon.class.getClassLoader(),
            new Class[] { Rayon.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        RayonClp clone = new RayonClp();

        clone.setRayonId(getRayonId());
        clone.setName(getName());
        clone.setKod(getKod());
        clone.setArchive(getArchive());

        return clone;
    }

    @Override
    public int compareTo(Rayon rayon) {
        int value = 0;

        value = getName().compareTo(rayon.getName());

        if (value != 0) {
            return value;
        }

        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof RayonClp)) {
            return false;
        }

        RayonClp rayon = (RayonClp) obj;

        long primaryKey = rayon.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    public Class<?> getClpSerializerClass() {
        return _clpSerializerClass;
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{rayonId=");
        sb.append(getRayonId());
        sb.append(", name=");
        sb.append(getName());
        sb.append(", kod=");
        sb.append(getKod());
        sb.append(", archive=");
        sb.append(getArchive());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(16);

        sb.append("<model><model-name>");
        sb.append("com.liferay.reestrRayonov.model.Rayon");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>rayonId</column-name><column-value><![CDATA[");
        sb.append(getRayonId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>name</column-name><column-value><![CDATA[");
        sb.append(getName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>kod</column-name><column-value><![CDATA[");
        sb.append(getKod());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>archive</column-name><column-value><![CDATA[");
        sb.append(getArchive());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
