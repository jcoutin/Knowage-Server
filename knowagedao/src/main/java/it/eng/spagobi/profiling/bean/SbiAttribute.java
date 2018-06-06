/*
 * Knowage, Open Source Business Intelligence suite
 * Copyright (C) 2016 Engineering Ingegneria Informatica S.p.A.
 *
 * Knowage is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Knowage is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package it.eng.spagobi.profiling.bean;

import java.util.HashSet;
import java.util.Set;

// Generated 22-dic-2009 14.20.04 by Hibernate Tools 3.2.4.GA

import it.eng.spagobi.commons.metadata.SbiHibernateModel;
import it.eng.spagobi.profiling.bo.ProfileAttributesValueTypes;

/**
 * SbiAttribute generated by hbm2java
 */
public class SbiAttribute extends SbiHibernateModel {

	private int attributeId;
	private String attributeName;
	private String description;
	private Short allowUser;
	private Short multivalue;
	private Short syntax;
	private Integer lovId;
	private Integer valueTypeId;
	private String valueTypeCd;
	private String lovColumns;
	private ProfileAttributesValueTypes value;

	private Set<SbiUserAttributes> sbiUserAttributeses = new HashSet<SbiUserAttributes>(0);

	public SbiAttribute() {
	}

	public SbiAttribute(int attributeId, String attributeName, String description) {
		this.attributeId = attributeId;
		this.attributeName = attributeName;
		this.description = description;
	}

	public SbiAttribute(int attributeId, String attributeName, String description, Set<SbiUserAttributes> sbiUserAttributeses) {
		this.attributeId = attributeId;
		this.attributeName = attributeName;
		this.description = description;
		this.sbiUserAttributeses = sbiUserAttributeses;
	}

	public SbiAttribute(int attributeId, String attributeName, String description, Short allowUser, Short syntax, Integer lovId, Short multivalue,
			ProfileAttributesValueTypes value) {
		this.attributeId = attributeId;
		this.attributeName = attributeName;
		this.description = description;
		this.allowUser = allowUser;
		this.syntax = syntax;
		this.lovId = lovId;
		this.multivalue = multivalue;
		this.value = value;
		this.lovColumns = lovColumns;
	}

	public int getAttributeId() {
		return this.attributeId;
	}

	public void setAttributeId(int attributeId) {
		this.attributeId = attributeId;
	}

	public String getAttributeName() {
		return this.attributeName;
	}

	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<SbiUserAttributes> getSbiUserAttributeses() {
		return this.sbiUserAttributeses;
	}

	public void setSbiUserAttributeses(Set<SbiUserAttributes> sbiUserAttributeses) {
		this.sbiUserAttributeses = sbiUserAttributeses;
	}

	public Short getAllowUser() {
		return allowUser;
	}

	public void setAllowUser(Short allowUser) {
		this.allowUser = allowUser;
	}

	public Short getMultivalue() {
		return multivalue;
	}

	public void setMultivalue(Short multivalue) {
		this.multivalue = multivalue;
	}

	public Short getSyntax() {
		return syntax;
	}

	public void setSyntax(Short syntax) {
		this.syntax = syntax;
	}

	public Integer getLovId() {
		return lovId;
	}

	public void setLovId(Integer lovId) {
		this.lovId = lovId;
	}

	public Integer getValueTypeId() {
		return valueTypeId;
	}

	public void setValueTypeId(Integer valueTypeId) {
		this.valueTypeId = valueTypeId;
	}

	public String getValueTypeCd() {
		return valueTypeCd;
	}

	public void setValueTypeCd(String valueTypeCd) {
		this.valueTypeCd = valueTypeCd;
	}

	public ProfileAttributesValueTypes getValue() {
		return value;
	}

	public void setValue(ProfileAttributesValueTypes value) {
		this.value = value;
	}

	public String getLovColumns() {
		return lovColumns;
	}

	public void setLovColumns(String lovColumns) {
		this.lovColumns = lovColumns;
	}

}
