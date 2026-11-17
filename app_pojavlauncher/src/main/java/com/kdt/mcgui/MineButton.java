package com.kdt.mcgui;

import android.content.*;
import android.graphics.*;
import android.util.*;

import androidx.core.content.res.ResourcesCompat;

import net.kdt.pojavlaunch.R;

public class MineButton extends androidx.appcompat.widget.AppCompatButton {
	
	public MineButton(Context ctx) {
		this(ctx, null);
	}
	
	public MineButton(Context ctx, AttributeSet attrs) {
		super(ctx, attrs);
		init();
	}

	public void init() {
		setTypeface(ResourcesCompat.getFont(getContext(), R.font.noto_sans_bold));
		setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.mine_button_background, null));
		setTextSize(TypedValue.COMPLEX_UNIT_PX, getResources().getDimensionPixelSize(R.dimen._13ssp));
	}

}

package com.kdt.mcgui;

import android.content.*;
import android.content.res.ColorStateList;
import android.graphics.*;
import android.util.*;

import androidx.core.content.res.ResourcesCompat;

import net.kdt.pojavlaunch.R;

public class MineButton extends androidx.appcompat.widget.AppCompatButton {

    public MineButton(Context ctx) {
        this(ctx, null);
    }

    public MineButton(Context ctx, AttributeSet attrs) {
        super(ctx, attrs);
        init();
    }

    public void init() {
        setTypeface(ResourcesCompat.getFont(getContext(), R.font.noto_sans_bold));
        setBackground(ResourcesCompat.getDrawable(getResources(), R.drawable.mine_button_background, null));
        setTextSize(TypedValue.COMPLEX_UNIT_PX, getResources().getDimensionPixelSize(R.dimen._13ssp));
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        if (getId() == R.id.play_button) {
            int[][] states = new int[][] {
                new int[] { android.R.attr.state_pressed },
                new int[] { -android.R.attr.state_enabled },
                new int[] {}
            };

            int[] colors = new int[] {
                Color.parseColor("#008C45"),
                Color.parseColor("#555555"),
                Color.parseColor("#00C853")
            };

            setBackgroundTintList(new ColorStateList(states, colors));
            setTextColor(Color.WHITE);
        }
    }
