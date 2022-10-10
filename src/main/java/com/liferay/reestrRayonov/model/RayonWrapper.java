package com.liferay.reestrRayonov.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Rayon}.
 * </p>
 *
 * @author liza
 * @see Rayon
 * @generated
 */
public class RayonWrapper implements Rayon, ModelWrapper<Rayon> {
    private Rayon _rayon;

    public RayonWrapper(Rayon rayon) {
        _rayon = rayon;
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

    /**
    * Returns the primary key of this rayon.
    *
    * @return the primary key of this rayon
    */
    @Override
    public long getPrimaryKey() {
        return _rayon.getPrimaryKey();
    }

    /**
    * Sets the primary key of this rayon.
    *
    * @param primaryKey the primary key of this rayon
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _rayon.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the rayon ID of this rayon.
    *
    * @return the rayon ID of this rayon
    */
    @Override
    public long getRayonId() {
        return _rayon.getRayonId();
    }

    /**
    * Sets the rayon ID of this rayon.
    *
    * @param rayonId the rayon ID of this rayon
    */
    @Override
    public void setRayonId(long rayonId) {
        _rayon.setRayonId(rayonId);
    }

    /**
    * Returns the name of this rayon.
    *
    * @return the name of this rayon
    */
    @Override
    public java.lang.String getName() {
        return _rayon.getName();
    }

    /**
    * Sets the name of this rayon.
    *
    * @param name the name of this rayon
    */
    @Override
    public void setName(java.lang.String name) {
        _rayon.setName(name);
    }

    /**
    * Returns the kod of this rayon.
    *
    * @return the kod of this rayon
    */
    @Override
    public int getKod() {
        return _rayon.getKod();
    }

    /**
    * Sets the kod of this rayon.
    *
    * @param kod the kod of this rayon
    */
    @Override
    public void setKod(int kod) {
        _rayon.setKod(kod);
    }

    /**
    * Returns the archive of this rayon.
    *
    * @return the archive of this rayon
    */
    @Override
    public boolean getArchive() {
        return _rayon.getArchive();
    }

    /**
    * Returns <code>true</code> if this rayon is archive.
    *
    * @return <code>true</code> if this rayon is archive; <code>false</code> otherwise
    */
    @Override
    public boolean isArchive() {
        return _rayon.isArchive();
    }

    /**
    * Sets whether this rayon is archive.
    *
    * @param archive the archive of this rayon
    */
    @Override
    public void setArchive(boolean archive) {
        _rayon.setArchive(archive);
    }

    @Override
    public boolean isNew() {
        return _rayon.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _rayon.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _rayon.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _rayon.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _rayon.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _rayon.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _rayon.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _rayon.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _rayon.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _rayon.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _rayon.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new RayonWrapper((Rayon) _rayon.clone());
    }

    @Override
    public int compareTo(com.liferay.reestrRayonov.model.Rayon rayon) {
        return _rayon.compareTo(rayon);
    }

    @Override
    public int hashCode() {
        return _rayon.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<com.liferay.reestrRayonov.model.Rayon> toCacheModel() {
        return _rayon.toCacheModel();
    }

    @Override
    public com.liferay.reestrRayonov.model.Rayon toEscapedModel() {
        return new RayonWrapper(_rayon.toEscapedModel());
    }

    @Override
    public com.liferay.reestrRayonov.model.Rayon toUnescapedModel() {
        return new RayonWrapper(_rayon.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _rayon.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _rayon.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _rayon.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof RayonWrapper)) {
            return false;
        }

        RayonWrapper rayonWrapper = (RayonWrapper) obj;

        if (Validator.equals(_rayon, rayonWrapper._rayon)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Rayon getWrappedRayon() {
        return _rayon;
    }

    @Override
    public Rayon getWrappedModel() {
        return _rayon;
    }

    @Override
    public void resetOriginalValues() {
        _rayon.resetOriginalValues();
    }
}
