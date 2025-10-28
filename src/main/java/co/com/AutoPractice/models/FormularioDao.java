package co.com.AutoPractice.models;

public class FormularioDao {
        private String subjectHeading;
        private String emailAddress;
        private String orderReference;
        private String attachFile;
        private String message;

    public FormularioDao(
            String subjectHeading,
            String emailAddress,
            String orderReference,
            String attachFile,
            String message
    ) {
        this.subjectHeading = subjectHeading;
        this.emailAddress = emailAddress;
        this.orderReference = orderReference;
        this.attachFile = attachFile;
        this.message = message;
    }

    public String getSubjectHeading() {
        return subjectHeading;
    }

    public void setSubjectHeading(String subjectHeading) {
        this.subjectHeading = subjectHeading;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getOrderReference() {
        return orderReference;
    }

    public void setOrderReference(String orderReference) {
        this.orderReference = orderReference;
    }

    public String getAttachFile() {
        return attachFile;
    }

    public void setAttachFile(String attachFile) {
        this.attachFile = attachFile;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
