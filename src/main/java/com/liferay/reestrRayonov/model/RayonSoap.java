package com.liferay.reestrRayonov.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.liferay.reestrRayonov.service.http.RayonServiceSoap}.
 *
 * @author liza
 * @see com.liferay.reestrRayonov.service.http.RayonServiceSoap
 * @generated
 */
public class RayonSoap implements Serializable {
    private long _rayonId;
    private String _name;
    private int _kod;
    private boolean _archive;

    public RayonSoap() {
    }

    public static RayonSoap toSoapModel(Rayon model) {
        RayonSoap soapModel = new RayonSoap();

        soapModel.setRayonId(model.getRayonId());
        soapModel.setName(model.getName());
        soapModel.setKod(model.getKod());
        soapModel.setArchive(model.getArchive());

        return soapModel;
    }

    public static RayonSoap[] toSoapModels(Rayon[] models) {
        RayonSoap[] soapModels = new RayonSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static RayonSoap[][] toSoapModels(Rayon[][] models) {
        RayonSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new RayonSoap[models.length][models[0].length];
        } else {
            soapModels = new RayonSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static RayonSoap[] toSoapModels(List<Rayon> models) {
        List<RayonSoap> soapModels = new ArrayList<RayonSoap>(models.size());

        for (Rayon model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new RayonSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _rayonId;
    }

    public void setPrimaryKey(long pk) {
        setRayonId(pk);
    }

    public long getRayonId() {
        return _rayonId;
    }

    public void setRayonId(long rayonId) {
        _rayonId = rayonId;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public int getKod() {
        return _kod;
    }

    public void setKod(int kod) {
        _kod = kod;
    }

    public boolean getArchive() {
        return _archive;
    }

    public boolean isArchive() {
        return _archive;
    }

    public void setArchive(boolean archive) {
        _archive = archive;
    }
}
