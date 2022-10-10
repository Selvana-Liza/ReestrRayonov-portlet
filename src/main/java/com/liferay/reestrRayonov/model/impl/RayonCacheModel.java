package com.liferay.reestrRayonov.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.liferay.reestrRayonov.model.Rayon;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Rayon in entity cache.
 *
 * @author liza
 * @see Rayon
 * @generated
 */
public class RayonCacheModel implements CacheModel<Rayon>, Externalizable {
    public long rayonId;
    public String name;
    public int kod;
    public boolean archive;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{rayonId=");
        sb.append(rayonId);
        sb.append(", name=");
        sb.append(name);
        sb.append(", kod=");
        sb.append(kod);
        sb.append(", archive=");
        sb.append(archive);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Rayon toEntityModel() {
        RayonImpl rayonImpl = new RayonImpl();

        rayonImpl.setRayonId(rayonId);

        if (name == null) {
            rayonImpl.setName(StringPool.BLANK);
        } else {
            rayonImpl.setName(name);
        }

        rayonImpl.setKod(kod);
        rayonImpl.setArchive(archive);

        rayonImpl.resetOriginalValues();

        return rayonImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        rayonId = objectInput.readLong();
        name = objectInput.readUTF();
        kod = objectInput.readInt();
        archive = objectInput.readBoolean();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(rayonId);

        if (name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(name);
        }

        objectOutput.writeInt(kod);
        objectOutput.writeBoolean(archive);
    }
}
