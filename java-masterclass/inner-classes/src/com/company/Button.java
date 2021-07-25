package com.company;

public class Button {
    private String title;
    private OnClickListener onClickListener;

    public Button(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setOnClickListener(OnClickListener onClickListener){
        this.onClickListener = onClickListener;
    }

    public void onClick(){
        this.onClickListener.onClick(this.title);
    }




    //there is no need to write that Button implements OnClickListener, because Button class is using method in interface
    public interface OnClickListener {
        public void  onClick(String title);
    }
}
