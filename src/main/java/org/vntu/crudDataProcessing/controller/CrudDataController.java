package org.vntu.crudDataProcessing.controller;

import java.util.List;
import org.vntu.crudDataProcessing.bean.CrudData;
import org.vntu.crudDataProcessing.service.CrudDataService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CrudDataController {

	CrudDataService crudDataService = new CrudDataService();

	@RequestMapping(value = "/allData", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<CrudData> getData() {
		List<CrudData> listOfCrudData = crudDataService.getAllData();
		return listOfCrudData;
	}

	@RequestMapping(value = "/data/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public CrudData getDataById(@PathVariable int id) {
		return crudDataService.getData(id);
	}

	@RequestMapping(value = "/allData", method = RequestMethod.POST, headers = "Accept=application/json")
	public CrudData addData(@RequestBody CrudData crudData) {
		return crudDataService.addData(crudData);
	}

	@RequestMapping(value = "/allData", method = RequestMethod.PUT, headers = "Accept=application/json")
	public CrudData updateData(@RequestBody CrudData crudData) {
		return crudDataService.updateData(crudData);
	}

	@RequestMapping(value = "/data/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void deleteData(@PathVariable("id") int id) {
		crudDataService.deleteData(id);
	}	
}
