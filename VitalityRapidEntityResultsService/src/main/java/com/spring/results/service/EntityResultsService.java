package com.spring.results.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.spring.results.model.Address;
import com.spring.results.model.EntityAddr;

@Service
public class EntityResultsService {

    private static final Map<Integer, EntityAddr> addressMap = new HashMap<Integer, EntityAddr>();
    static {
        addressMap.put(1, new EntityAddr(1,"addrLine1","addrType1","dateTimeLastModified1","defaultRecord1","osUserLastModified1","postCd1","requestingEntity1","sessUserLastModified1","street1" ,"suburb1","tenantId1","townOrCity1"));
        addressMap.put(2, new EntityAddr(2,"addrLine2","addrType2","dateTimeLastModified2","defaultRecord2","osUserLastModified2","postCd2","requestingEntity2","sessUserLastModified2","street2" ,"suburb2","tenantId2","townOrCity2"));
        addressMap.put(3, new EntityAddr(3,"addrLine3","addrType3","dateTimeLastModified3","defaultRecord3","osUserLastModified3","postCd3","requestingEntity3","sessUserLastModified3","street3" ,"suburb3","tenantId3","townOrCity3"));
        addressMap.put(4, new EntityAddr(4,"addrLine4","addrType4","dateTimeLastModified4","defaultRecord4","osUserLastModified4","postCd4","requestingEntity4","sessUserLastModified4","street4" ,"suburb4","tenantId4","townOrCity4"));
        addressMap.put(5, new EntityAddr(5,"addrLine5","addrType5","dateTimeLastModified5","defaultRecord5","osUserLastModified5","postCd5","requestingEntity5","sessUserLastModified5","street5" ,"suburb5","tenantId5","townOrCity5"));
    }

    public EntityAddr getAddressresults(int id) {
        return addressMap.get(id);
    }

    public List<EntityAddr> getAllAddressResults() {
        List<EntityAddr> entityAddr =  new ArrayList<EntityAddr>();
        entityAddr.addAll(addressMap.values());
        return entityAddr;
    }

}
