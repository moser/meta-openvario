
print("LUA!");

function clamp_pct(val)
  lower = 0;
  upper = 100;
  return math.max(lower, math.min(upper, val))
end


xcsoar.input_event.new("key_F11",
                       function(e)
                         xcsoar.settings.setvariovol(clamp_pct(xcsoar.settings.variovol + 5));
                         print("vol up");
                       end
);

xcsoar.input_event.new("key_F12",
                       function(e)
                         xcsoar.settings.setvariovol(clamp_pct(xcsoar.settings.variovol - 5));
                         print("vol down");
                       end
);
