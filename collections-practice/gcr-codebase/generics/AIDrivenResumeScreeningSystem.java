
import java.util.ArrayList;
import java.util.List;

abstract class JobRole {

    private String roleName;

    public JobRole(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleName() {
        return roleName;
    }

    public abstract String getKeySkills();
}

class SoftwareEngineer extends JobRole {

    public SoftwareEngineer() {
        super("Software Engineer");
    }

    @Override
    public String getKeySkills() {
        return "Java, DSA, System Design";
    }
}
class DataScientist extends JobRole {

    public DataScientist() {
        super("Data Scientist");
    }

    @Override
    public String getKeySkills() {
        return "Python, ML, Statistics";
    }
}
class ProductManager extends JobRole {

    public ProductManager() {
        super("Product Manager");
    }

    @Override
    public String getKeySkills() {
        return "Product Strategy, Communication, Analytics";
    }
}
class Resume<T extends JobRole> {

    private String candidateName;
    private T jobRole;

    public Resume(String candidateName, T jobRole) {
        this.candidateName = candidateName;
        this.jobRole = jobRole;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public T getJobRole() {
        return jobRole;
    }
}
class ScreeningUtil {

    public static <T extends JobRole> void screenResume(Resume<T> resume) {

        System.out.println("Screening Resume...");
        System.out.println("Candidate: " + resume.getCandidateName());
        System.out.println("Role: " + resume.getJobRole().getRoleName());
        System.out.println("Required Skills: " +
                resume.getJobRole().getKeySkills());
        System.out.println("Status: Shortlisted by AI");
        System.out.println("--------------------------------");
    }
}

class ScreeningPipeline {

    public static void processAllResumes(
            List<? extends JobRole> jobRoles) {

        for (JobRole role : jobRoles) {
            System.out.println(
                "Processing role in pipeline: " + role.getRoleName()
            );
        }
    }
}

public class AIDrivenResumeScreeningSystem {

    public static void main(String[] args) {

        Resume<SoftwareEngineer> seResume =
                new Resume<>("Kavi Jain", new SoftwareEngineer());

        Resume<DataScientist> dsResume =
                new Resume<>("Amit Sharma", new DataScientist());

        Resume<ProductManager> pmResume =
                new Resume<>("Riya Verma", new ProductManager());

        ScreeningUtil.screenResume(seResume);
        ScreeningUtil.screenResume(dsResume);
        ScreeningUtil.screenResume(pmResume);

        List<JobRole> roles = new ArrayList<>();
        roles.add(new SoftwareEngineer());
        roles.add(new DataScientist());
        roles.add(new ProductManager());

        System.out.println("---- Screening Pipeline ----");
        ScreeningPipeline.processAllResumes(roles);
    }
}
