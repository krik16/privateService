package com.rongyi.easy.entity;

import org.bson.types.ObjectId;

import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

/**
 * 终端机信息
 * 
 * @author jiejie 2014年7月8日 下午3:12:22
 */
@Entity("terminals")
public class TerminalInfo {

    @Id
    private ObjectId id;
    private String code;
    private double logoX;
    private double logoY;
    private String note;
    private String elevator;
    private String escalator;
    private String floorCode;
    private String agent_installed_id;//（目前agent软件包id）
    private String agent_distributed_id;//（上次发布的agent软件包id）
    private String frontend_installed_id;//（目前前端软件包id）
    private String frontend_distributed_id;//（上次发布的前端软件包id）
    private String backend_installed_id;//（目前后端软件包id）
    private String backend_distributed_id;//（上次发布的后端软件包id）
    private String backend_data_installed_id;//（目前后端数据软件包id）
    private String backend_data_distributed_id;//（上次发布的后端软件包id）
    private String agent_installed_version;//（目前agent软件包版本号），
    private String agent_distributed_version;//上次发布的agent软件包版本号）
    private String frontend_installed_version;//（目前前端软件包版本号）
    private String frontend_distributed_version;//（上次发布的前端软件包版本号）
    private String backend_installed_version;//（目前后端软件包版本号）
    private String backend_distributed_version;//上次发布的后端软件包版本号）
    private String backend_data_installed_version;//目前后端数据软件包版本号）
    private String backend_data_distributed_version;//（上次发布的后端软件包版本号）
    private String created_at;//（建立时间）
    private String updated_at;//（更新时间）
    private String mall_area_id;
    
    


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getLogoX() {
        return logoX;
    }

    public void setLogoX(double logoX) {
        this.logoX = logoX;
    }

    public double getLogoY() {
        return logoY;
    }

    public void setLogoY(double logoY) {
        this.logoY = logoY;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getElevator() {
		return elevator;
	}

	public void setElevator(String elevator) {
		this.elevator = elevator;
	}

	public String getEscalator() {
		return escalator;
	}

	public void setEscalator(String escalator) {
		this.escalator = escalator;
	}

	public String getFloorCode() {
		return floorCode;
	}

	public void setFloorCode(String floorCode) {
		this.floorCode = floorCode;
	}

	public String getAgent_installed_id() {
		return agent_installed_id;
	}

	public void setAgent_installed_id(String agent_installed_id) {
		this.agent_installed_id = agent_installed_id;
	}

	public String getAgent_distributed_id() {
		return agent_distributed_id;
	}

	public void setAgent_distributed_id(String agent_distributed_id) {
		this.agent_distributed_id = agent_distributed_id;
	}

	public String getFrontend_installed_id() {
		return frontend_installed_id;
	}

	public void setFrontend_installed_id(String frontend_installed_id) {
		this.frontend_installed_id = frontend_installed_id;
	}

	public String getFrontend_distributed_id() {
		return frontend_distributed_id;
	}

	public void setFrontend_distributed_id(String frontend_distributed_id) {
		this.frontend_distributed_id = frontend_distributed_id;
	}

	public String getBackend_installed_id() {
		return backend_installed_id;
	}

	public void setBackend_installed_id(String backend_installed_id) {
		this.backend_installed_id = backend_installed_id;
	}

	public String getBackend_distributed_id() {
		return backend_distributed_id;
	}

	public void setBackend_distributed_id(String backend_distributed_id) {
		this.backend_distributed_id = backend_distributed_id;
	}

	public String getBackend_data_installed_id() {
		return backend_data_installed_id;
	}

	public void setBackend_data_installed_id(String backend_data_installed_id) {
		this.backend_data_installed_id = backend_data_installed_id;
	}

	public String getBackend_data_distributed_id() {
		return backend_data_distributed_id;
	}

	public void setBackend_data_distributed_id(String backend_data_distributed_id) {
		this.backend_data_distributed_id = backend_data_distributed_id;
	}

	public String getAgent_installed_version() {
		return agent_installed_version;
	}

	public void setAgent_installed_version(String agent_installed_version) {
		this.agent_installed_version = agent_installed_version;
	}

	public String getAgent_distributed_version() {
		return agent_distributed_version;
	}

	public void setAgent_distributed_version(String agent_distributed_version) {
		this.agent_distributed_version = agent_distributed_version;
	}

	public String getFrontend_installed_version() {
		return frontend_installed_version;
	}

	public void setFrontend_installed_version(String frontend_installed_version) {
		this.frontend_installed_version = frontend_installed_version;
	}

	public String getFrontend_distributed_version() {
		return frontend_distributed_version;
	}

	public void setFrontend_distributed_version(String frontend_distributed_version) {
		this.frontend_distributed_version = frontend_distributed_version;
	}

	public String getBackend_installed_version() {
		return backend_installed_version;
	}

	public void setBackend_installed_version(String backend_installed_version) {
		this.backend_installed_version = backend_installed_version;
	}

	public String getBackend_distributed_version() {
		return backend_distributed_version;
	}

	public void setBackend_distributed_version(String backend_distributed_version) {
		this.backend_distributed_version = backend_distributed_version;
	}

	public String getBackend_data_installed_version() {
		return backend_data_installed_version;
	}

	public void setBackend_data_installed_version(String backend_data_installed_version) {
		this.backend_data_installed_version = backend_data_installed_version;
	}

	public String getBackend_data_distributed_version() {
		return backend_data_distributed_version;
	}

	public void setBackend_data_distributed_version(String backend_data_distributed_version) {
		this.backend_data_distributed_version = backend_data_distributed_version;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public String getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}
    
    public String getMall_area_id() {
        return mall_area_id;
    }
    
    public void setMall_area_id(String mall_area_id) {
        this.mall_area_id = mall_area_id;
    }

}
