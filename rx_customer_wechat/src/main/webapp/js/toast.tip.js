/**
 * Created by me on 2017/8/2.
 */
function fade(type, el, duration, IEsupport) {
    var isIn     = (type == 'in'),
        IE       = (IEsupport) ? IEsupport : false,
        opacity  = isIn ? 0 : 1,
        interval = 50,
        gap      = interval / duration;

    if(isIn) {
        el.style.display = 'block';
        el.style.opacity = opacity;
        if(IE) {
            el.style.filter = 'alpha(opacity=' + opacity + ')';
            el.style.filter = 'progid:DXImageTransform.Microsoft.Alpha(Opacity=' + opacity + ')';
        }
    }

    function func() {
        opacity = isIn ? opacity + gap : opacity - gap;
        el.style.opacity = opacity;
        if(IE) {
            el.style.filter = 'alpha(opacity=' + opacity * 100 + ')';
            el.style.filter = 'progid:DXImageTransform.Microsoft.Alpha(Opacity=' + opacity * 100 + ')';
        }
        if(opacity <= 0 || opacity >= 1) { window.clearInterval(fading); }
        if(opacity <= 0) { el.style.display = "none"; }
    }
    var fading = window.setInterval(func, interval);
}//弹入，弹出