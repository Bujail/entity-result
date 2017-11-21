package com.spring.results.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Entities {
	
	private long entityNo;
	private Date dateOfBirth;
	private Date dateTimeLastModified;
	private String firstname;
	private String fullName;
	private String init;
	private String language;
	private String languageCd;
	private String legalRefNo;
	private String legalRefNoType;
	private String localeCd;
	private BigDecimal localeInfoId;
	private String nickname;
	private String osUserLastModified;
	private String personNonPerson;
	private BigDecimal recordSet;
	private BigDecimal requestingEntity;
	private String sessUserLastModified;
	private String sex;
	private String surname;
	private BigDecimal tenantId;
	private String title;
	//private EntityRole entityRole;
	private List<EntityAddr> entityAddrs;
	/*private List<EntityAddrDet> entityAddrDets;
	private List<EntityAttribute> entityAttributes;
	private List<EntityConsent> entityConsents1;
	private List<EntityConsent> entityConsents2;
	private List<EntityConsent> entityConsents3;
	private List<EntityContactDet> entityContactDets;
	private List<EntityCredCardDtl> entityCredCardDtls;
	private List<EntityCrossMap> entityCrossMaps;
	private List<EntityEmail> entityEmails;
	private List<EntityGlobalAddr> entityGlobalAddrs;
	private List<EntityImage> entityImages;
	private List<EntityOtherNo> entityOtherNos;
	private List<EntityPolicyConnHist> entityPolicyConnHists;
	private List<EntityPolicyConnOld> entityPolicyConnOlds;
	private List<EntityRoleUsage> entityRoleUsages;
	private List<EntityServiceSubss> entityServiceSubsses;
	private List<EntityTelNo> entityTelNos;
	private List<EntConsentStatus> entConsentStatuses;
	private EntDeathDate entDeathDate;
	private List<EntOtherName> entOtherNames;
	private List<FactCd> factCds;
	private List<GeneralCorrespondence> generalCorrespondences1;
	private List<GeneralCorrespondence> generalCorrespondences2;
	private InactiveEntity inactiveEntity;
	private List<InfoSrce> infoSrces;
	private Member member;
	private List<SicIndicator> sicIndicators;*/
	public long getEntityNo() {
		return entityNo;
	}
	public void setEntityNo(long entityNo) {
		this.entityNo = entityNo;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Date getDateTimeLastModified() {
		return dateTimeLastModified;
	}
	public void setDateTimeLastModified(Date dateTimeLastModified) {
		this.dateTimeLastModified = dateTimeLastModified;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getInit() {
		return init;
	}
	public void setInit(String init) {
		this.init = init;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getLanguageCd() {
		return languageCd;
	}
	public void setLanguageCd(String languageCd) {
		this.languageCd = languageCd;
	}
	public String getLegalRefNo() {
		return legalRefNo;
	}
	public void setLegalRefNo(String legalRefNo) {
		this.legalRefNo = legalRefNo;
	}
	public String getLegalRefNoType() {
		return legalRefNoType;
	}
	public void setLegalRefNoType(String legalRefNoType) {
		this.legalRefNoType = legalRefNoType;
	}
	public String getLocaleCd() {
		return localeCd;
	}
	public void setLocaleCd(String localeCd) {
		this.localeCd = localeCd;
	}
	public BigDecimal getLocaleInfoId() {
		return localeInfoId;
	}
	public void setLocaleInfoId(BigDecimal localeInfoId) {
		this.localeInfoId = localeInfoId;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getOsUserLastModified() {
		return osUserLastModified;
	}
	public void setOsUserLastModified(String osUserLastModified) {
		this.osUserLastModified = osUserLastModified;
	}
	public String getPersonNonPerson() {
		return personNonPerson;
	}
	public void setPersonNonPerson(String personNonPerson) {
		this.personNonPerson = personNonPerson;
	}
	public BigDecimal getRecordSet() {
		return recordSet;
	}
	public void setRecordSet(BigDecimal recordSet) {
		this.recordSet = recordSet;
	}
	public BigDecimal getRequestingEntity() {
		return requestingEntity;
	}
	public void setRequestingEntity(BigDecimal requestingEntity) {
		this.requestingEntity = requestingEntity;
	}
	public String getSessUserLastModified() {
		return sessUserLastModified;
	}
	public void setSessUserLastModified(String sessUserLastModified) {
		this.sessUserLastModified = sessUserLastModified;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public BigDecimal getTenantId() {
		return tenantId;
	}
	public void setTenantId(BigDecimal tenantId) {
		this.tenantId = tenantId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<EntityAddr> getEntityAddrs() {
		return entityAddrs;
	}
	public void setEntityAddrs(List<EntityAddr> entityAddrs) {
		this.entityAddrs = entityAddrs;
	}

}

