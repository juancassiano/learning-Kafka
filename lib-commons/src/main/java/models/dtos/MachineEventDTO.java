package models.dtos;

import models.requests.CreateMachineRequest;

import java.io.Serial;
import java.io.Serializable;

public class MachineEventDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private Long machineId;
    private String machineName;
    private String machineStatus;
    private String machineType;

    public MachineEventDTO() {
    }

    public MachineEventDTO(CreateMachineRequest request) {
        this.machineId = request.machineId();
        this.machineName = request.machineName();
        this.machineStatus = request.machineStatus();
        this.machineType = request.machineType();
    }

    public Long getMachineId() {
        return machineId;
    }

    public String getMachineName() {
        return machineName;
    }

    public String getMachineStatus() {
        return machineStatus;
    }

    public String getMachineType() {
        return machineType;
    }

    @Override
    public String toString() {
        return "MachineEventDTO{" +
                "machineId=" + machineId +
                ", machineName='" + machineName + '\'' +
                ", machineStatus='" + machineStatus + '\'' +
                ", machineType='" + machineType + '\'' +
                '}';
    }
}
