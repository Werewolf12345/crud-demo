package com.alexeiboriskin.cruddemo;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Arrays;

@Entity
@Table(name = "msc_user")
public class MscUser {
    private Long id;
    private Timestamp dateCreated;
    private Timestamp dateModified;
    private String email;
    private String firstName;
    private String lastName;
    private String company;
    private String title;
    private String middleName;
    private String password;
    private String status;
    private Timestamp tosAcceptedDate;
    private Boolean tosAcceptedFlag;
    private Integer nativeLogin;
    private Boolean referenceCheckFlag;
    private Double avgSellerRating;
    private byte[] photo;
    private String photoFilename;
    private String invitationCode;
    private Long invitee;
    private Timestamp resetDate;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "date_created", nullable = false)
    public Timestamp getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Timestamp dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Column(name = "date_modified", nullable = false)
    public Timestamp getDateModified() {
        return dateModified;
    }

    public void setDateModified(Timestamp dateModified) {
        this.dateModified = dateModified;
    }

    @Column(name = "email", nullable = false, length = 75)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "first_name", nullable = false, length = 50)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "last_name", nullable = false, length = 50)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "company", nullable = true, length = 100)
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Column(name = "title", nullable = true, length = 100)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "middle_name", nullable = true, length = 25)
    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @Column(name = "password", nullable = false, length = 125)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "status", nullable = false, length = 15)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Column(name = "tos_accepted_date", nullable = true)
    public Timestamp getTosAcceptedDate() {
        return tosAcceptedDate;
    }

    public void setTosAcceptedDate(Timestamp tosAcceptedDate) {
        this.tosAcceptedDate = tosAcceptedDate;
    }

    @Column(name = "tos_accepted_flag", nullable = true)
    public Boolean getTosAcceptedFlag() {
        return tosAcceptedFlag;
    }

    public void setTosAcceptedFlag(Boolean tosAcceptedFlag) {
        this.tosAcceptedFlag = tosAcceptedFlag;
    }

    @Column(name = "native_login", nullable = true)
    public Integer getNativeLogin() {
        return nativeLogin;
    }

    public void setNativeLogin(Integer nativeLogin) {
        this.nativeLogin = nativeLogin;
    }

    @Column(name = "reference_check_flag", nullable = true)
    public Boolean getReferenceCheckFlag() {
        return referenceCheckFlag;
    }

    public void setReferenceCheckFlag(Boolean referenceCheckFlag) {
        this.referenceCheckFlag = referenceCheckFlag;
    }

    @Column(name = "avg_seller_rating", nullable = true, precision = 0)
    public Double getAvgSellerRating() {
        return avgSellerRating;
    }

    public void setAvgSellerRating(Double avgSellerRating) {
        this.avgSellerRating = avgSellerRating;
    }

    @Column(name = "photo", nullable = true)
    @Lob
    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    @Column(name = "photo_filename", nullable = true, length = 100)
    public String getPhotoFilename() {
        return photoFilename;
    }

    public void setPhotoFilename(String photoFilename) {
        this.photoFilename = photoFilename;
    }

    @Column(name = "invitation_code", nullable = true, length = 100)
    public String getInvitationCode() {
        return invitationCode;
    }

    public void setInvitationCode(String invitationCode) {
        this.invitationCode = invitationCode;
    }

    @Column(name = "invitee", nullable = true)
    public Long getInvitee() {
        return invitee;
    }

    public void setInvitee(Long invitee) {
        this.invitee = invitee;
    }

    @Column(name = "reset_date", nullable = true)
    public Timestamp getResetDate() {
        return resetDate;
    }

    public void setResetDate(Timestamp resetDate) {
        this.resetDate = resetDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MscUser mscUser = (MscUser) o;

        if (id != null ? !id.equals(mscUser.id) : mscUser.id != null) return false;
        if (dateCreated != null ? !dateCreated.equals(mscUser.dateCreated) : mscUser.dateCreated != null) return false;
        if (dateModified != null ? !dateModified.equals(mscUser.dateModified) : mscUser.dateModified != null)
            return false;
        if (email != null ? !email.equals(mscUser.email) : mscUser.email != null) return false;
        if (firstName != null ? !firstName.equals(mscUser.firstName) : mscUser.firstName != null) return false;
        if (lastName != null ? !lastName.equals(mscUser.lastName) : mscUser.lastName != null) return false;
        if (company != null ? !company.equals(mscUser.company) : mscUser.company != null) return false;
        if (title != null ? !title.equals(mscUser.title) : mscUser.title != null) return false;
        if (middleName != null ? !middleName.equals(mscUser.middleName) : mscUser.middleName != null) return false;
        if (password != null ? !password.equals(mscUser.password) : mscUser.password != null) return false;
        if (status != null ? !status.equals(mscUser.status) : mscUser.status != null) return false;
        if (tosAcceptedDate != null ? !tosAcceptedDate.equals(mscUser.tosAcceptedDate) : mscUser.tosAcceptedDate != null)
            return false;
        if (tosAcceptedFlag != null ? !tosAcceptedFlag.equals(mscUser.tosAcceptedFlag) : mscUser.tosAcceptedFlag != null)
            return false;
        if (nativeLogin != null ? !nativeLogin.equals(mscUser.nativeLogin) : mscUser.nativeLogin != null) return false;
        if (referenceCheckFlag != null ? !referenceCheckFlag.equals(mscUser.referenceCheckFlag) : mscUser.referenceCheckFlag != null)
            return false;
        if (avgSellerRating != null ? !avgSellerRating.equals(mscUser.avgSellerRating) : mscUser.avgSellerRating != null)
            return false;
        if (!Arrays.equals(photo, mscUser.photo)) return false;
        if (photoFilename != null ? !photoFilename.equals(mscUser.photoFilename) : mscUser.photoFilename != null)
            return false;
        if (invitationCode != null ? !invitationCode.equals(mscUser.invitationCode) : mscUser.invitationCode != null)
            return false;
        if (invitee != null ? !invitee.equals(mscUser.invitee) : mscUser.invitee != null) return false;
        if (resetDate != null ? !resetDate.equals(mscUser.resetDate) : mscUser.resetDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (dateCreated != null ? dateCreated.hashCode() : 0);
        result = 31 * result + (dateModified != null ? dateModified.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (company != null ? company.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (middleName != null ? middleName.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (tosAcceptedDate != null ? tosAcceptedDate.hashCode() : 0);
        result = 31 * result + (tosAcceptedFlag != null ? tosAcceptedFlag.hashCode() : 0);
        result = 31 * result + (nativeLogin != null ? nativeLogin.hashCode() : 0);
        result = 31 * result + (referenceCheckFlag != null ? referenceCheckFlag.hashCode() : 0);
        result = 31 * result + (avgSellerRating != null ? avgSellerRating.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(photo);
        result = 31 * result + (photoFilename != null ? photoFilename.hashCode() : 0);
        result = 31 * result + (invitationCode != null ? invitationCode.hashCode() : 0);
        result = 31 * result + (invitee != null ? invitee.hashCode() : 0);
        result = 31 * result + (resetDate != null ? resetDate.hashCode() : 0);
        return result;
    }
}
