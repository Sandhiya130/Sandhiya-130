import React from 'react';
import { SmallAvatar } from '../../images/avatars';

export const FollowSuggestionCard = ({ youMightKnow }) => {
    return (
        // <div className="follow-card">
        //     <p className="trends-topic m-0">{follow.topic}</p>
        //     <h2 className="m-0">{follow.name}</h2>
        //     <p className="trend-tweet-count m-0">{follow.tweets}</p>
        // </div>
        <div className="who-to-follow">
            <div className="left">
                <SmallAvatar width="48" image={youMightKnow.image} />
            </div>
            <div className="middle">
                <span className="follow-card-name">{youMightKnow.name}</span>
                <span className="follow-card-handle">{youMightKnow.handle}</span>
            </div>
            <div className="right">
                <div className="btn follow-btn text-center">
                    Follow
                </div>
            </div>
        </div>
    )
}
