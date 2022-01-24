import React, { createContext, useReducer } from "react";
import AppReducer from './AppReducer.js';

const initialState = {
    tweets: [
        {
            id: 1,
            user: {
                name: 'Microsoft',
                image: 'https://pbs.twimg.com/profile_images/1454912483248930822/_hO4WPRC_400x400.png',
                handle: '@Microsoft',
            },
            tweet: {
                content: "You: *clicks sendd Outlook: Ah, ah, ah. Did you forget to attach something to this email?",
                //image: 'https://pbs.twimg.com/card_img/1246823270524973058/IbkZhS3u?format=jpg&name=small',
                time: '1h',
                comments: '17k',
                retweets: '368',
                likes: '11k'
            }
        },
        {
            id: 2,
            user: {
                name: 'National Geographic',
                image: 'https://pbs.twimg.com/profile_images/1383057272998354948/fi8a91e4_400x400.jpg',
                handle: '@NatGeo',
            },
            tweet: {
                content:'Hi I’m   @CarlaEWill , Manager of Audio @natgeo here to share a new six-part podcast series. Starting January 27, Nat Geo Explorer Tara Roberts takes us #IntotheDepths on a search for buried ship wrecks from the transatlantic slave trade. https://apple.co/natgeointothedepths',
                image:'https://pbs.twimg.com/media/FI_66WVXsAAf4JR?format=jpg&name=4096x4096',
                time: '9h',
                comments: '21k',
                retweets: '3k',
                likes: '17k'
            }
        },
        {
            id: 3,
            user: {
                name: 'International Space Station',
                
                image: 'https://pbs.twimg.com/profile_images/1189945624583720960/k6MtoeIt_400x400.jpg',
                handle: '@Space_Station',
            },
            tweet: {
                content: 'On Thursday, the crew studied how space affects visual function, prepared for next week’s spacewalk, and worked on life support gear.',
                image: 'https://pbs.twimg.com/card_img/1481717453575045120/_4XDETo_?format=jpg&name=small',
                time: '5h',
                comments: '7.3k',
                retweets: '9.4k',
                likes: '70k'
            }
        }
    ]

}

// create context
export const GlobalContext = createContext(initialState);

// provider
export const GlobalProvider = ({ children }) => {
    const [state, dipatch] = useReducer(AppReducer, initialState);

    function getTweet(id) {

        return state.tweets.find(tweet => tweet.id === id);
    }
    function addTweet(tweets) {
        dipatch({
            type: 'ADD_TWEET',
            payload: tweets
        })
    }

    return (<GlobalContext.Provider value={{ tweets: state.tweets, addTweet, getTweet }}>
        {children}
    </GlobalContext.Provider>)
}
