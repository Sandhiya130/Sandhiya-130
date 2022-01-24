import React from 'react';
import { Trend } from '../trending/Trend';
import { SettingsIcon } from '../../images/svg/svgs';

export const TrendsList = () => {
    const trends = [
        {
            name: '#t20worldcup',
            topic: 'Trending in World',
            tweets: '3,700k'
        },
        {
            name: '#pongal',
            topic: 'Trending in India',
            tweets: '37k'
        }, {
            name: '#VickywedsKatrina',
            topic: 'Trending in India',
            tweets: '3,267'
        },
        {
            name: '#covid3rdwave',
            topic: 'Trending in World',
            tweets: '27k'
        }, {
            name: '#arrmusic',
            topic: 'Trending in India',
            tweets: '481k'
        }
    ]
    return (
        <div>
            <div className="trends-for-you flex-space-between">
                <h1 className="m-0">Trends for you</h1>
                <SettingsIcon />
            </div>
            <div className="trends">
                {trends.map(trend => (<Trend trend={trend} />))}
            </div>
        </div>
    )
}
