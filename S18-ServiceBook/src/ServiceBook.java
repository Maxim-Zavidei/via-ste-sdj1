import java.util.ArrayList;

public class ServiceBook {

    private ArrayList<Service> services;

    public ServiceBook() {
        services = new ArrayList<>();
    }

    public void addService(Service service) {
        services.add(service);
    }

    public int getNumberOfService() {
        return services.size();
    }

    public Service getService(int index) {
        return services.get(index);
    }

    public Service[] getAllServices() {
        Service[] toReturn = new Service[services.size()];
        for (int i = 0; i < services.size(); i++) toReturn[i] = services.get(i);
        return toReturn;
    }

    public int[] getAllServiceMilages() {
        int[] toReturn = new int[services.size()];
        for (int i = 0; i < services.size(); i++) toReturn[i] = services.get(i).getMileage();
        return toReturn;
    }

    public boolean hasServiceOnDate(Date date) {
        for (Service service : services) if (service.getDate().equals(date)) return true;
        return false;
    }

    public Date getDateOfLastService() {
        return services.get(services.size()).getDate();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ServiceBook)) return false;
        ServiceBook other = (ServiceBook) obj;
        if (services.size() != other.services.size()) return false;
        for (int i = 0; i < services.size(); i++) if (!services.get(i).equals(other.services.get(i))) return false;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder toReturn = new StringBuilder("ServiceBook:{");
        for (int i = 0; i < services.size() - 1; i++) toReturn.append(services.get(i)).append(", ");
        return toReturn.append(services.get(services.size() - 1)).append("}").toString();
    }
}
