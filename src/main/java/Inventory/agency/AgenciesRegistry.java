package Inventory.agency;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AgenciesRegistry {

    private final Map<String, Agency> agencies = new HashMap<>();

    public Set<Map.Entry<String,Agency>> getAllAgencies (){
        Set<Map.Entry<String, Agency>> setAgencies = Set.copyOf(agencies.entrySet());
        return setAgencies;
    }
    public void addAgency(String agencyKey, Agency agency){
        agencies.put(agencyKey,agency);
    }

    public void addAllAgency( Map<String, Agency> agenciesNie){
        agencies.putAll(agenciesNie);
    }


}
