package org.vntu.crudDataProcessing.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.vntu.crudDataProcessing.bean.CrudData;

public class CrudDataService {

 static HashMap<Integer,CrudData> crudDataIdMap = getCrudDataIdMap();

 public CrudDataService() {
  super();

  if(crudDataIdMap == null) {
   crudDataIdMap = new HashMap<Integer,CrudData>();

  // Creating some objects of Country while initializing
  // https://vertex-academy.com/tutorials/ru/massiv-obektov-v-java/
  // https://javarush.ru/groups/posts/1932-koe-chto-o-massivakh
  // https://otus.ru/nest/post/956/
   CrudData[] crudData = new CrudData[11];

   crudData[0] = new CrudData(1, "String 1", 10);
   crudData[1] = new CrudData(2, "String 2", 20);
   crudData[2] = new CrudData(3, "String 3", 30);
   crudData[3] = new CrudData(4, "String 4", 40);
   crudData[4] = new CrudData(5, "String 5", 50);
   crudData[5] = new CrudData(6, "String 6", 60);
   crudData[6] = new CrudData(7, "String 7", 70);
   crudData[7] = new CrudData(8, "String 8", 80);
   crudData[8] = new CrudData(9, "String 9", 90);
   crudData[9] = new CrudData(10, "String 10", 100);
   crudData[10] = new CrudData(11, "String 11", 110);


   for (int countId = 0; countId < 11; countId++)
      crudDataIdMap.put(countId + 1, crudData[countId]);
  }
 }

 public List<CrudData> getAllData() {
  List<CrudData> allData = new ArrayList<CrudData>(crudDataIdMap.values());
  return allData;
 }

 public CrudData getData(int id) {
  CrudData data = crudDataIdMap.get(id);
  return data;
 }

 public CrudData addData(CrudData crudData) {
  crudData.setId(getMaxId() + 1);
  crudDataIdMap.put(crudData.getId(), crudData);
  return crudData;
 }
 
 public CrudData updateData(CrudData crudData) {
  if(crudData.getId() <= 0)
   return null;

  crudDataIdMap.put(crudData.getId(), crudData);
  return crudData;

 }

 public void deleteData(int id) {
  crudDataIdMap.remove(id);
 }

 public static HashMap<Integer, CrudData> getCrudDataIdMap() {
  return crudDataIdMap;
 }
 

 // Utility method to get max id
 public static int getMaxId() { 
   int max = 0;

   for (int id:crudDataIdMap.keySet()) {  
    if(max <= id)
      max = id;
   }  

  return max;
 }
}

