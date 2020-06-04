package com.easy.yuydiffutils.uiutils.entity;

import java.io.Serializable;
import java.util.List;

/**
 * Author: yuyang
 * Date:2019/6/20 15:16
 */
public class PickBaseEntity implements Serializable {


    private long timestamp;


    public static class RestheadBean{

        private int errorCode;
        private String message;

        public int getErrorCode() {
            return errorCode;
        }

        public void setErrorCode(int errorCode) {
            this.errorCode = errorCode;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }

    public static class RestbodyBean {
        private List<HigherLevelBean> higherLevel;

        public List<HigherLevelBean> getHigherLevel() {
            return higherLevel;
        }

        public void setHigherLevel(List<HigherLevelBean> higherLevel) {
            this.higherLevel = higherLevel;
        }

        public static class HigherLevelBean {
            /**
             * id : 251
             * name : 北沥村
             */

            private int id;
            private String name;
            private boolean isChecked = false;

            public HigherLevelBean(int id, String name) {
                this.id = id;
                this.name = name;
                this.isChecked = false;
            }

            public boolean isChecked() {
                return isChecked;
            }

            public void setChecked(boolean checked) {
                isChecked = checked;
            }
            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
    }
}
