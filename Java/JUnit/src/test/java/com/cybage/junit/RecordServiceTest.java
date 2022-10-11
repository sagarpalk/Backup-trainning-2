package com.cybage.junit;

import static org.junit.Assert.assertEquals;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
 
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
//import org.mockito.junit.MockitoJUnitRunner;

@RunWith(org.mockito.runners.MockitoJUnitRunner.class)
public class RecordServiceTest {

	@InjectMocks
    RecordService recordService;
     
    @Mock
    DatabaseDAO databaseMock;
     
    @Mock
    NetworkDAO networkMock;
     
    @Test
    public void saveTest()
    {
       // boolean saved = recordService.save("temp.txt");
       // assertEquals(true, saved);
        
      //  verify(databaseMock).save("temp.txt");
       /// verify(networkMock).save("temp.txt");
    	
    	 boolean saved = recordService.save("temp.txt");
         assertEquals(true, saved);
          
         verify(databaseMock,times(1)).save("temp.txt");
         verify(networkMock,times(1)).save("temp.txt");
    }

}
