package com.apeironsol.need.util.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import org.apache.commons.lang.StringUtils;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.jsf.FacesContextUtils;

import com.apeironsol.need.core.model.BuildingBlock;
import com.apeironsol.need.core.service.BuildingBlockService;

@FacesConverter("buildingBlockConverter")
public class BuildingBlockConverter implements Converter {

	private final BuildingBlockService	buildingBlockService;

	public BuildingBlockConverter() {
		WebApplicationContext ctx = FacesContextUtils.getWebApplicationContext(FacesContext.getCurrentInstance());
		buildingBlockService = ctx.getBean(BuildingBlockService.class);
	}

	@Override
	public Object getAsObject(final FacesContext context, final UIComponent component, final String value) {
		try {
			if (value != null && !StringUtils.isEmpty(value)) {
				return buildingBlockService.findBuildingBlockById(Long.valueOf(value));
			} else {
				return null;
			}
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public String getAsString(final FacesContext context, final UIComponent component, final Object value) {
		if (value != null && value instanceof BuildingBlock) {
			return ((BuildingBlock) value).getId().toString();
		} else {
			return null;
		}
	}

}
