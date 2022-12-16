package qal3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class CusumDriftTest {

    CusumDrift drift = new CusumDrift("2", "0", "0", false);
    CusumDrift drift2 = new CusumDrift("2", "1", "0", true);


    @Test void isEquals(){
        assertEquals(drift, drift);
    }

    @Test void isnotEquals(){
        assertNotEquals(drift, drift2);
    }

    @Test void testJSON(){
        String json = drift.toJSON();
        CusumDrift driftcopy = CusumDrift.fromJSON(json);
        assertEquals(driftcopy, drift);
    }
    
}
