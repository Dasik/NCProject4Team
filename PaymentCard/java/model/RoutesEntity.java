package java.model;

import javax.persistence.*;

/**
 * Created by vit on 06.03.2017.
 */
@Entity
@Table(name = "ROUTES", schema = "CAPTAIN", catalog = "")
public class RoutesEntity {
    private int routeId;
    private String routeNumber;

    @Id
    @Column(name = "ROUTE_ID")
    public int getRouteId() {
        return routeId;
    }

    public void setRouteId(int routeId) {
        this.routeId = routeId;
    }

    @Basic
    @Column(name = "ROUTE_NUMBER")
    public String getRouteNumber() {
        return routeNumber;
    }

    public void setRouteNumber(String routeNumber) {
        this.routeNumber = routeNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RoutesEntity that = (RoutesEntity) o;

        if (routeId != that.routeId) return false;
        if (routeNumber != null ? !routeNumber.equals(that.routeNumber) : that.routeNumber != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = routeId;
        result = 31 * result + (routeNumber != null ? routeNumber.hashCode() : 0);
        return result;
    }
}
